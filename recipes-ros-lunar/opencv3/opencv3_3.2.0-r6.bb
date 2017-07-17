# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "OpenCV 3.x"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=72e2d027e24072f17b13fd0f23e9aaa8"

DEPENDS = "catkin cmake ffmpeg libjpeg libpng-dev libtiff-dev libv4l-dev libvtk-qt libwebp-dev protobuf protobuf-dev python python-numpy zlib"
SRC_URI = "https://github.com/ros-gbp/opencv3-release/archive/release/lunar/opencv3/3.2.0-6.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8c47d02d9301b4ae60acee24bcbb9301"
SRC_URI[sha256sum] = "9d84a39c982e6e7e011cf12ddb6962117dcd07e0a9ab5a5ddd096c4d5aeded29"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
