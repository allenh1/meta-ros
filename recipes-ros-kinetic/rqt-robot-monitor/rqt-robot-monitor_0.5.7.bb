# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_robot_monitor displays diagnostics_agg topics messages that    are published"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs python-rospkg python-qt-binding qt-gui qt-gui-py-common rospy rqt-bag rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_robot_monitor-release/archive/release/kinetic/rqt_robot_monitor/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d3a45cffca83b7f25fa946a7f7e87b8f"
SRC_URI[sha256sum] = "17bc4bc5456900c7f597df892c44e0a8b631925dca92ede6cc744a10639cdda3"
S = "${WORKDIR}/rqt_robot_monitor-release-release-kinetic-rqt_robot_monitor-0.5.7-0"

inherit catkin
