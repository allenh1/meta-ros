# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin"
SRC_URI = "https://github.com/ros-gbp/pr2_common-release/archive/release/lunar/pr2_machine/1.12.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d5fe5f5c0b7e073a2d38a2bb3771dbae"
SRC_URI[sha256sum] = "40b49d0ab5ee3385100824aff66485ba6eaf32dd2eadd4c4d4682f499ea538b3"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
