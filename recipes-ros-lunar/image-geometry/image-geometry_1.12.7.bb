# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "image_geometry contains C++ and Python libraries for interpreting images     geo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native opencv3 sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/vision_opencv-release/archive/release/lunar/image_geometry/1.12.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eddb5607b9983c591d81b728aedabd48"
SRC_URI[sha256sum] = "9bde7f89d48a30769e53036c0a6f64dcda95842c87c84641d1bfece3c6bd6448"
S = "${WORKDIR}/vision_opencv-release-release-lunar-image_geometry-1.12.7-0"

inherit catkin
