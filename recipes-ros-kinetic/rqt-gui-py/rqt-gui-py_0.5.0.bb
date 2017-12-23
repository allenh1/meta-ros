# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_gui_py enables GUI plugins to use the Python client library for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native qt-gui rospy rqt-gui"
SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/kinetic/rqt_gui_py/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "67dbf1ddf2c1b698dff01411522e7c1b"
SRC_URI[sha256sum] = "5562a8e2a995ecde75a3fc7ae8cb824b905d25d8de32f11172723087fd7847f7"
S = "${WORKDIR}/rqt-release-release-kinetic-rqt_gui_py-0.5.0-0"

inherit catkin
