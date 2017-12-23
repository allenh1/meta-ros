# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "camera_calibration_parsers contains routines for reading and writing camera cali"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native pkgconfig rosconsole roscpp roscpp-serialization sensor-msgs yaml-cpp"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/kinetic/camera_calibration_parsers/1.11.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0158ed1a8528010c70a5d1ea177377dd"
SRC_URI[sha256sum] = "f3b555d2f8d8b7b223ae61f8b14237e1adeeb999a691bc9b4165383a2b1da69f"
S = "${WORKDIR}/image_common-release-release-kinetic-camera_calibration_parsers-1.11.13-0"

inherit catkin
