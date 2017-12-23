# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_web is a simple web content viewer for rqt. Users can show web content in Qt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding qt-gui rospy rqt-gui rqt-gui-py webkit-dependency"
SRC_URI = "https://github.com/ros-gbp/rqt_web-release/archive/release/kinetic/rqt_web/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "200162134888f18f5fcfcd4a51d3bc43"
SRC_URI[sha256sum] = "106888a84f50f1d5adf2e80db7a0e91548f95feab02bc8c90b13cccbe634046d"
S = "${WORKDIR}/rqt_web-release-release-kinetic-rqt_web-0.4.8-0"

inherit catkin
