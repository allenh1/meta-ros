# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The roomba_stage package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native fake-localization map-server move-base stage-ros"
SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/kinetic/roomba_stage/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "87b62b64043a06c02ff979430c924aee"
SRC_URI[sha256sum] = "d221683d4726b82dca7270ba87d4ef0a58e4768b986ee2e8438a7f361499cc1b"
S = "${WORKDIR}/navigation_tutorials-release-release-kinetic-roomba_stage-0.2.3-0"

inherit catkin
