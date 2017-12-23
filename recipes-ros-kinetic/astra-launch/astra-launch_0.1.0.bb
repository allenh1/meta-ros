# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Drivers for Orbbec Astra Devices."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "astra-camera catkin-native depth-image-proc image-proc nodelet rgbd-launch tf"
SRC_URI = "https://github.com/ros-drivers-gbp/astra_launch-release/archive/release/kinetic/astra_launch/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6595d6edd7732567d06643153ab18097"
SRC_URI[sha256sum] = "2bcd0416313e222146854349f269f08736e8afcf6a512ff436d16041a428ba3c"
S = "${WORKDIR}/astra_launch-release-release-kinetic-astra_launch-0.1.0-0"

inherit catkin
