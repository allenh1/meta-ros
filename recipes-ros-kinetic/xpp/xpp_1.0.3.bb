# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Xpp is collection of packages for the visualization of motion plans for      flo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native xpp-examples xpp-hyq xpp-msgs xpp-quadrotor xpp-states xpp-vis"
SRC_URI = "https://github.com/leggedrobotics/${PN}-release/archive/release/kinetic/${PN}/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0ed56eaaa34be399d25c9a667c148c39"
SRC_URI[sha256sum] = "d3fb8fe2df036ec2a8db094d58be600fdbce09d11b1485a67939dbf832e6ef29"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.0.3-0"

inherit catkin
