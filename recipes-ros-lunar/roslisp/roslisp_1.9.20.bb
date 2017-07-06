# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin rosgraph_msgs roslang rospack sbcl std_srvs"
SRC_URI = "https://github.com/ros-gbp/roslisp-release/archive/release/lunar/roslisp/1.9.20-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "29536ff36ed02334a8827a087bcd23b9"
SRC_URI[sha256sum] = "1c2e50a3a6a860af2cc09fcacb332433c99dae8913706478ad9307436925d622"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
