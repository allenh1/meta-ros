# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Legacy version of yaml cpp without boost, namespaced to avoid system conflicts."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/yujinrobot-release/yaml_cpp_0_3-release/archive/release/kinetic/yaml_cpp_0_3/0.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3467b4260691068f54f5e3ee2695112d"
SRC_URI[sha256sum] = "434e23ecd0af3c87b26327868dfdc51f662cb9eef6b8adfc4cbf191dd2931a36"
S = "${WORKDIR}/yaml_cpp_0_3-release-release-kinetic-yaml_cpp_0_3-0.3.1-0"

inherit catkin
