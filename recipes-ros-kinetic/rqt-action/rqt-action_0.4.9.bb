# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_action provides a feature to introspect all available ROS   action (from act"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rospy rqt-msg rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_action-release/archive/release/kinetic/rqt_action/0.4.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a681aba3695bbd40959ea5b27a816bf2"
SRC_URI[sha256sum] = "ccd9349bd5eec39ff064b6d4beb24acac44e1a470ab599b8b508507eeac2d2ef"
S = "${WORKDIR}/rqt_action-release-release-kinetic-rqt_action-0.4.9-0"

inherit catkin
