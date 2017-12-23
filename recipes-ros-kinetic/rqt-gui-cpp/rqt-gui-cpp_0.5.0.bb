# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_gui_cpp enables GUI plugins to use the C++ client library for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nodelet qt-gui qt-gui-cpp qtbase5-dev roscpp"
SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/kinetic/rqt_gui_cpp/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6c3efe823a12e1027dc6444910b0af81"
SRC_URI[sha256sum] = "7e649bc586f53c1e3d5d997916b7422b4097795580fdc9421898a3b54eae26c6"
S = "${WORKDIR}/rqt-release-release-kinetic-rqt_gui_cpp-0.5.0-0"

inherit catkin
