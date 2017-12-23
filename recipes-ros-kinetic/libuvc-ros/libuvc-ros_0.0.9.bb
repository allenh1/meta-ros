# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "libuvc_ros metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native libuvc-camera"
SRC_URI = "https://github.com/ros-drivers-gbp/libuvc_ros-release/archive/release/kinetic/libuvc_ros/0.0.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ec9fdfb3779440cf39eb4865034e87fb"
SRC_URI[sha256sum] = "0155835d9ce9713af49fcf43acfb1d7b5c33d79205d55f81e77e02b47051ab21"
S = "${WORKDIR}/libuvc_ros-release-release-kinetic-libuvc_ros-0.0.9-0"

inherit catkin
