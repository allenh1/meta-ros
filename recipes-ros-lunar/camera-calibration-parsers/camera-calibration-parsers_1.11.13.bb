# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "camera_calibration_parsers contains routines for reading and writing camera cali"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native pkgconfig rosconsole roscpp roscpp-serialization sensor-msgs yaml-cpp"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/lunar/camera_calibration_parsers/1.11.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "623c2cb8798480e42d93465b0cf24fe1"
SRC_URI[sha256sum] = "137c2e361062bbbe543bd7f20c6a4044298ac04c6bb24c0cb3834e9be5bbf46d"
S = "${WORKDIR}/image_common-release-release-lunar-camera_calibration_parsers-1.11.13-0"

inherit catkin
