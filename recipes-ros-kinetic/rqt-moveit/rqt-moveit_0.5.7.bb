# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An rqt-based tool that assists monitoring tasks    for  motion planner    develo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=26;endline=26;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-qt-binding rosnode rospy rostopic rqt-gui rqt-gui-py rqt-py-common rqt-topic sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_moveit-release/archive/release/kinetic/rqt_moveit/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ffaa02852dc69c171893542f377132ed"
SRC_URI[sha256sum] = "e88db6b5e1b396b14786a0da4eeb62fcfa21b035ad4ae9a112ea566dd0db7c8a"
S = "${WORKDIR}/rqt_moveit-release-release-kinetic-rqt_moveit-0.5.7-0"

inherit catkin
