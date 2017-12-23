# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS driver to use the Kork NanoKontrol MIDI device as a joystick."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-pygame rospy sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/korg_nanokontrol-release/archive/release/kinetic/korg_nanokontrol/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9b5bbb05cac99e8e3179ee9aa0ba4cf3"
SRC_URI[sha256sum] = "e69b88fc52d1c76b2b60cb90588e3247ad4725c6229075d5fd539b0ea0962614"
S = "${WORKDIR}/korg_nanokontrol-release-release-kinetic-korg_nanokontrol-0.1.2-0"

inherit catkin
