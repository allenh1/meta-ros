# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a kinematics and dynamics impletation for the thormang3.  "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules robotis-math roscpp"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-MPC-release/archive/release/kinetic/thormang3_kinematics_dynamics/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8400d3427353c6acbf85562f546041cb"
SRC_URI[sha256sum] = "d81195164094008524caa2a39c5536c4ab24b94ce6df742bd2c1259a5baf6061"
S = "${WORKDIR}/ROBOTIS-THORMANG-MPC-release-release-kinetic-thormang3_kinematics_dynamics-0.1.3-0"

inherit catkin
