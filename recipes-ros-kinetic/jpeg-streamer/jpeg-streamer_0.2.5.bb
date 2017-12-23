# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tools for streaming JPEG-formatted CompressedImage topics over HTTP"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native image-transport roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/camera_umd-release/archive/release/kinetic/jpeg_streamer/0.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "169d54581ac30d6792301e1f23a71372"
SRC_URI[sha256sum] = "bc0ec3ece34d11640edfd7538271d5f5233d3d41157e2859b9010fb6edc8e18b"
S = "${WORKDIR}/camera_umd-release-release-kinetic-jpeg_streamer-0.2.5-0"

inherit catkin
