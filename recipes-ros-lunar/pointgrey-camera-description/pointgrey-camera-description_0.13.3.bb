# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF descriptions for Point Grey cameras"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin robot-state-publisher urdf xacro"
SRC_URI = "https://github.com/ros-drivers-gbp/pointgrey_camera_driver-release/archive/release/lunar/pointgrey_camera_description/0.13.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "424d01cfdea20a399d4846de0811dabe"
SRC_URI[sha256sum] = "96396731852eb60ff0b33468e69fafc7069cd31a2f0bf5ccb8c7f648429eef32"
S = "${WORKDIR}/pointgrey_camera_driver-release-release-lunar-pointgrey_camera_description-0.13.3-0"

inherit catkin
