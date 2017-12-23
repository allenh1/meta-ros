# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_py_common provides common functionality for rqt plugins written in Python.  "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native genmsg genpy python-qt-binding qt-gui rosbag roslib rospy rostopic std-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/kinetic/rqt_py_common/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f0cc633769bcf55fffa061e68ee1afb1"
SRC_URI[sha256sum] = "c9c4185b52c7945d2edb69634f4b1b41190130762b97fe8791cef56db84b52ba"
S = "${WORKDIR}/rqt-release-release-kinetic-rqt_py_common-0.5.0-0"

inherit catkin
