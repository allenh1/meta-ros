# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Converts between Python dictionaries and JSON to rospy messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime roslib rospy rostest std-msgs"
SRC_URI = "https://github.com/baalexander/rospy_message_converter-release/archive/release/kinetic/rospy_message_converter/0.4.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "60ce37f92579e590fb03e867afe539e8"
SRC_URI[sha256sum] = "df7e004fa71e33871a879c8d4991ac5388d4a4936fb204fa7384acb4ad1faf31"
S = "${WORKDIR}/rospy_message_converter-release-release-kinetic-rospy_message_converter-0.4.0-1"

inherit catkin
