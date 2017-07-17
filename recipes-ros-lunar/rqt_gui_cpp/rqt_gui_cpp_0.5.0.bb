# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_gui_cpp enables GUI plugins to use the C++ client library for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=3bf5a30be68df5478e551f7655d2cf71"

DEPENDS = "catkin nodelet qt_gui qt_gui_cpp qtbase5-dev roscpp"
SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/lunar/rqt_gui_cpp/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "da50eaf69e1751abe531b64cbd9652cd"
SRC_URI[sha256sum] = "522a720f3db0b4465af08f55bd3105c1f95146d4b87a72f66b05b93585cdccfb"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
