# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF descriptions for Point Grey cameras"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robot-state-publisher urdf xacro"
SRC_URI = "https://github.com/ros-drivers-gbp/pointgrey_camera_driver-release/archive/release/kinetic/pointgrey_camera_description/0.13.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0683be190aa7857e604bd3728687aac8"
SRC_URI[sha256sum] = "2ff3a538c01ad77963c50eec9f566ed2079501d5150fad367a9f6f629e338a7e"
S = "${WORKDIR}/pointgrey_camera_driver-release-release-kinetic-pointgrey_camera_description-0.13.4-0"

inherit catkin
