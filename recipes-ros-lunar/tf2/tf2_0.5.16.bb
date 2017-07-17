# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2 is the second generation of the transform library, which lets
    the user k"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=d76cbba94d33b4f84efe75fb2879a2cf"

DEPENDS = "catkin geometry_msgs libconsole-bridge-dev rostime tf2_msgs"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "34b70224e577d01e8e2e8224e4d82585"
SRC_URI[sha256sum] = "5c3731bd35d64a15cc8f935aef430f12424f23eca239f5474df2f036d4ca1d77"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
