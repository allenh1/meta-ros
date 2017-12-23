# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Compressed_depth_image_transport provides a plugin to image_transport for transp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge dynamic-reconfigure image-transport"
SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/kinetic/compressed_depth_image_transport/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ea48f34feccee094cf86f82841b112e"
SRC_URI[sha256sum] = "a26d3b115242594feb41805e4ff27582307961b64a464f1f170c9e271a456794"
S = "${WORKDIR}/image_transport_plugins-release-release-kinetic-compressed_depth_image_transport-1.9.5-0"

inherit catkin
