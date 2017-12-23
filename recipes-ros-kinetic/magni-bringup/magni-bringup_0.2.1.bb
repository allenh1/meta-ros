# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The magni_bringup package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager diff-drive-controller joint-state-controller magni-description robot-state-publisher ubiquity-motor"
SRC_URI = "https://github.com/UbiquityRobotics-release/magni_robot-release/archive/release/kinetic/magni_bringup/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e89854e7692a46cbc38f83f6c78b91f"
SRC_URI[sha256sum] = "f16038601df31e443bb3300641ed8e7071817e1a88b772c619f4bf2bde681bd8"
S = "${WORKDIR}/magni_robot-release-release-kinetic-magni_bringup-0.2.1-0"

inherit catkin
