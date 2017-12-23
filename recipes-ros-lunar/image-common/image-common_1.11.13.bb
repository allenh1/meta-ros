# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common code for working with images in ROS."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers camera-info-manager catkin-native catkin image-transport polled-camera"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/lunar/image_common/1.11.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "57bd46ce6a6c847b598c5b1055d311fd"
SRC_URI[sha256sum] = "fb856178afb0fd3e3a3b83873b9761dde7b6d2c324d972c75bd587a661174abe"
S = "${WORKDIR}/image_common-release-release-lunar-image_common-1.11.13-0"

inherit catkin
