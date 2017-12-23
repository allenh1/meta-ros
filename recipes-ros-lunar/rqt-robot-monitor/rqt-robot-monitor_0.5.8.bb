# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_robot_monitor displays diagnostics_agg topics messages that    are published"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin diagnostic-msgs python-rospkg python-qt-binding qt-gui qt-gui-py-common rospy rqt-bag rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_robot_monitor-release/archive/release/lunar/rqt_robot_monitor/0.5.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "23356bee75cb83cb7ab4fa3357322ff1"
SRC_URI[sha256sum] = "1402d4cf18ed241c03650310a7f4d081f615bfd7aff5ddda33281820cbd34cc6"
S = "${WORKDIR}/rqt_robot_monitor-release-release-lunar-rqt_robot_monitor-0.5.8-0"

inherit catkin
