# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package attempts to show the features of ROS python API step-by-step,     i"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native message-generation message-runtime rospy rostest std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/lunar/rospy_tutorials/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7e9918dde561cecec78e117a1f3f2c89"
SRC_URI[sha256sum] = "03e2ce137e0f5aabf72886cbbd38bc4718a9d74951911295070e9a21b35ab81a"
S = "${WORKDIR}/ros_tutorials-release-release-lunar-rospy_tutorials-0.8.0-0"

inherit catkin
