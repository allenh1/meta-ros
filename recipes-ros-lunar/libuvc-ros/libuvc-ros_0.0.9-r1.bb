# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "libuvc_ros metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native catkin libuvc-camera"
SRC_URI = "https://github.com/ros-drivers-gbp/libuvc_ros-release/archive/release/lunar/libuvc_ros/0.0.9-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "333cd847c70dde8a28ad3cdd1f875f90"
SRC_URI[sha256sum] = "4b9e7c47dcdb721df22d4931491694440fb0b59e9fa25c6a6973df5a5bd85219"
S = "${WORKDIR}/libuvc_ros-release-release-lunar-libuvc_ros-0.0.9-1"

inherit catkin
