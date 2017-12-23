# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "image_geometry contains C++ and Python libraries for interpreting images     geo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native opencv3 sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/vision_opencv-release/archive/release/kinetic/image_geometry/1.12.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f7ca746117e575c353ad884bab23ba2f"
SRC_URI[sha256sum] = "66add18697dd701fcbad289f69eb75ef3a26791bfe4dabe3915cea8c647099ec"
S = "${WORKDIR}/vision_opencv-release-release-kinetic-image_geometry-1.12.7-0"

inherit catkin
