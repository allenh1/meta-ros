# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Compressed_image_transport provides a plugin to image_transport for transparentl"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cv-bridge dynamic-reconfigure image-transport"
SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/lunar/compressed_image_transport/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e2a8510d0476604ba0adbdb43c9f6e6b"
SRC_URI[sha256sum] = "c7bd9bebcf0fa8d306943a42b059bf92bb3d6fef9dea895fd8110a2b7c40947c"
S = "${WORKDIR}/image_transport_plugins-release-release-lunar-compressed_image_transport-1.9.5-0"

inherit catkin
