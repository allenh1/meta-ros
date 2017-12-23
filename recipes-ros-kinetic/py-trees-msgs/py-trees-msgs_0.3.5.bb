# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used by py_trees_ros and some extras for the mock demos/tests."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native dynamic-reconfigure message-generation message-runtime std-msgs uuid-msgs"
SRC_URI = "https://github.com/stonier/py_trees_msgs-release/archive/release/kinetic/py_trees_msgs/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "39fe3d4f7f553ed2edb890fbb35c0ed3"
SRC_URI[sha256sum] = "21fad667f2b8d5e56bf7e508ae1502d66dca1adb26c10c332b70d2711d8161fa"
S = "${WORKDIR}/py_trees_msgs-release-release-kinetic-py_trees_msgs-0.3.5-0"

inherit catkin
