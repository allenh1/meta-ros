# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack contains all descriptions, drivers and bringup facilities for Neuroni"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d81febe1baeaed0bfd599be384185f36"

DEPENDS = "catkin-native katana katana-arm-gazebo katana-description katana-gazebo-plugins katana-moveit-ikfast-plugin katana-msgs katana-teleop katana-tutorials kni"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/kinetic/katana_driver/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "045935d282db1a5548c7e05aa08182b4"
SRC_URI[sha256sum] = "3d5d56cedaa4edeb93f670ce1c9731d86f7d289ffcccac3bc04dcac9ab7975c9"
S = "${WORKDIR}/katana_driver-release-release-kinetic-katana_driver-1.1.2-0"

inherit catkin
