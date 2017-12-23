# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Conversions between ros and sophus."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules ecl-build geometry-msgs sophus tf"
SRC_URI = "https://github.com/yujinrobot-release/sophus_ros_toolkit-release/archive/release/kinetic/sophus_ros_conversions/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5a425a9d1a886ac834bfde4467c29072"
SRC_URI[sha256sum] = "e1cfba0989700bb4b96f67c8e60c3d7c7b69f51aca0b8a8457a287436e8b9d65"
S = "${WORKDIR}/sophus_ros_toolkit-release-release-kinetic-sophus_ros_conversions-0.1.3-0"

inherit catkin
