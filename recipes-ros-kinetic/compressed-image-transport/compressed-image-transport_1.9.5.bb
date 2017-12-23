# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Compressed_image_transport provides a plugin to image_transport for transparentl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge dynamic-reconfigure image-transport"
SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/kinetic/compressed_image_transport/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ea1f64952099d1ac82b22b851bf38706"
SRC_URI[sha256sum] = "a5889f67c061753e8971189c93b8da7fa9222c180cd61da7b1b6c473ce957816"
S = "${WORKDIR}/image_transport_plugins-release-release-kinetic-compressed_image_transport-1.9.5-0"

inherit catkin
