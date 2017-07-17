# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "libuvc_ros metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=ba55965de4a003048fe4d60b7409dca8"

DEPENDS = "catkin libuvc_camera"
SRC_URI = "https://github.com/ros-drivers-gbp/libuvc_ros-release/archive/release/lunar/libuvc_ros/0.0.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fa48c6004cb4fb46030c7c230259dbac"
SRC_URI[sha256sum] = "e27df057efeb0d414835ad08bfb10d5dde68f1b98658245887a625bcb2e2bbc5"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
