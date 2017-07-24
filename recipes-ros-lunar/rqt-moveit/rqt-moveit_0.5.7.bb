# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An rqt-based tool that assists monitoring tasks    for  motion planner    develo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=26;endline=26;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native python-qt-binding rosnode rospy rostopic rqt-gui rqt-gui-py rqt-py-common rqt-topic sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_moveit-release/archive/release/lunar/rqt_moveit/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c8fbc4e03d9f259ede69c49d91b11977"
SRC_URI[sha256sum] = "c32768d2983be346e38ed35ae186cdddee7bb42caf03df027064974d0e3fa5af"
S = "${WORKDIR}/rqt_moveit-release-release-lunar-rqt_moveit-0.5.7-0"

inherit catkin
