# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_gui_py enables GUI plugins to use the Python client library for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native qt-gui rospy rqt-gui"
SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/lunar/rqt_gui_py/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1cc04f73aa66e3cecb0bfc4f14217986"
SRC_URI[sha256sum] = "67bfbfdf4139f5570fd613c9b55815a892b0ce3fef6e0221c1017cf793570d26"
S = "${WORKDIR}/rqt-release-release-lunar-rqt_gui_py-0.5.0-0"

inherit catkin
