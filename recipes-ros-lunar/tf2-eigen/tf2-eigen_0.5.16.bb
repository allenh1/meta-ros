# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_eigen"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cmake_modules eigen geometry_msgs tf2"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_eigen/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "233e6c53203ab1982d21b9b8982882ab"
SRC_URI[sha256sum] = "505d13a61aeb828bb10f02c2cb4a5bb8bb00fe7a2e86190c1b0808d3100176ba"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
