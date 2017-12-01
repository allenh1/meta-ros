# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS driver for OpenNI depth (+ RGB) cameras. These include:         Microsoft "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native dynamic-reconfigure image-transport libopenni-dev libusb-1.0-dev log4cxx nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/openni_camera-release/archive/release/lunar/openni_camera/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "32e103ff8d0e5f57d074fddb984b259b"
SRC_URI[sha256sum] = "018b6fdd13d35fd40980450a9aef83267eeeabb9392849b2144f90ca7df6fae7"
S = "${WORKDIR}/openni_camera-release-release-lunar-openni_camera-1.9.5-0"

inherit catkin
