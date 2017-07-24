# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2 is the second generation of the transform library, which lets     the user k"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin geometry-msgs console-bridge rostime tf2-msgs"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "34b70224e577d01e8e2e8224e4d82585"
SRC_URI[sha256sum] = "5c3731bd35d64a15cc8f935aef430f12424f23eca239f5474df2f036d4ca1d77"
S = "${WORKDIR}/geometry2-release-release-lunar-tf2-0.5.16-0"

inherit catkin
