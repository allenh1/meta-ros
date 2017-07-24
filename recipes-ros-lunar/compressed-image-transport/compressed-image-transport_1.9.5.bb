# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Compressed_image_transport provides a plugin to image_transport for transparentl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native cv-bridge dynamic-reconfigure image-transport"
SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/lunar/compressed_image_transport/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7ff2007258c96582cdc6076eccaccc16"
SRC_URI[sha256sum] = "e8dc9d78bd1033f1d3bd3ed1ba52ebdbb5daa4eed211db1b0bdcf949fd48ac09"
S = "${WORKDIR}/image_transport_plugins-release-release-lunar-compressed_image_transport-1.9.5-0"

inherit catkin
