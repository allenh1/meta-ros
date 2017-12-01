# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common definitions (positions, velocities, angular angles,     angular rates) an"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen"
SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/lunar/xpp_states/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f6820cfddc5c42f571c8201471beddf3"
SRC_URI[sha256sum] = "f9593c71a529158d9b80a72663a0d0fcbc62b2028cb1bc7c11889ea4071ff71f"
S = "${WORKDIR}/xpp-release-release-lunar-xpp_states-1.0.3-0"

inherit catkin
