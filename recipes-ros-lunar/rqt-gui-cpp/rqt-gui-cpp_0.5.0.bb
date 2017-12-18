# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_gui_cpp enables GUI plugins to use the C++ client library for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin nodelet qt-gui qt-gui-cpp qtbase5-dev roscpp"
SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/lunar/rqt_gui_cpp/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "da50eaf69e1751abe531b64cbd9652cd"
SRC_URI[sha256sum] = "522a720f3db0b4465af08f55bd3105c1f95146d4b87a72f66b05b93585cdccfb"
S = "${WORKDIR}/rqt-release-release-lunar-rqt_gui_cpp-0.5.0-0"

inherit catkin
