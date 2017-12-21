# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack contains all descriptions, drivers and bringup facilities for Neuroni"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d81febe1baeaed0bfd599be384185f36"

DEPENDS = "catkin-native katana katana-arm-gazebo katana-description katana-gazebo-plugins katana-moveit-ikfast-plugin katana-msgs katana-teleop katana-tutorials kni"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/lunar/katana_driver/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "37dd7b534517e45429554355fce3c6c7"
SRC_URI[sha256sum] = "4e6408ea9eeb476c9819d44575cad93600e145c900d7fd9be663c15f24ec82a4"
S = "${WORKDIR}/katana_driver-release-release-lunar-katana_driver-1.1.2-0"

inherit catkin
