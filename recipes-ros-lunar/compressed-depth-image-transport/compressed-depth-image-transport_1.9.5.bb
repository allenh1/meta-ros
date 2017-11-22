# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Compressed_depth_image_transport provides a plugin to image_transport for transp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin cv-bridge dynamic-reconfigure image-transport"
SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/lunar/compressed_depth_image_transport/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "011f3a660325219888a3a7eb07bc6d4d"
SRC_URI[sha256sum] = "181a4b08caa3dc050c32b7d54e39756653c4b893a0bd8019735e598866b74c66"
S = "${WORKDIR}/image_transport_plugins-release-release-lunar-compressed_depth_image_transport-1.9.5-0"

inherit catkin
