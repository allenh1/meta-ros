# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Xpp is collection of packages for the visualization of motion plans for      flo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin xpp-examples xpp-hyq xpp-msgs xpp-quadrotor xpp-states xpp-vis"
SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/lunar/xpp/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2267a337c1a982bbe39a742a76eabaa9"
SRC_URI[sha256sum] = "17eb85e98ff2b3ba677a084ec034a3c8bc5245ac76a41b0d58942c1c345671db"
S = "${WORKDIR}/xpp-release-release-lunar-xpp-1.0.3-0"

inherit catkin
