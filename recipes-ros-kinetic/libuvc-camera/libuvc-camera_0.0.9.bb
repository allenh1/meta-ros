# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "USB Video Class camera driver"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "camera-info-manager catkin-native dynamic-reconfigure image-transport libuvc nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/libuvc_ros-release/archive/release/kinetic/libuvc_camera/0.0.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0488e40c42345e4f09b05bd9cbc541c0"
SRC_URI[sha256sum] = "e3c5a857b580df64f0220e8a5d904f8f4c726c3258e664388a25443e2898db2c"
S = "${WORKDIR}/libuvc_ros-release-release-kinetic-libuvc_camera-0.0.9-0"

inherit catkin
