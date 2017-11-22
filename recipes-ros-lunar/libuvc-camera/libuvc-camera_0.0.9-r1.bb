# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "USB Video Class camera driver"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "camera-info-manager catkin dynamic-reconfigure image-transport libuvc nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/libuvc_ros-release/archive/release/lunar/libuvc_camera/0.0.9-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "63c95b05bc2945631e86801feb935d13"
SRC_URI[sha256sum] = "f1c4e8f87b30e1d939880db78279ad912c16b1239f27b6e105881ace98462cbf"
S = "${WORKDIR}/libuvc_ros-release-release-lunar-libuvc_camera-0.0.9-1"

inherit catkin
