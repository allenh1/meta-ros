# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "OpenCV 3.x"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake ffmpeg jasper libjpeg libpng12-dev libtiff-dev libv4l-dev libvtk-qt protobuf protobuf-dev python python-numpy zlib"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/3.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5f0ab410fa8792c7d3b30b07c504baf2"
SRC_URI[sha256sum] = "103f28d76c6451d2371a09fb693f0c466da6dfaf374a4fa92f7dac2ad5a7f4ab"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-3.3.1-0"

inherit catkin
