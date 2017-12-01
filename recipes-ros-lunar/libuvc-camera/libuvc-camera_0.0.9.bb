# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "USB Video Class camera driver"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "camera-info-manager catkin-native dynamic-reconfigure image-transport libuvc nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/libuvc_ros-release/archive/release/lunar/libuvc_camera/0.0.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "96dc5c87dbc1f9105660c0902ed7ef85"
SRC_URI[sha256sum] = "31ee066fb3d90432de4b83fc0d7996625a063193eb4eb1e0112fb8e05b7886c8"
S = "${WORKDIR}/libuvc_ros-release-release-lunar-libuvc_camera-0.0.9-0"

inherit catkin
