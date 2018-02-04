# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Low-level build system macros and infrastructure for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

CATKIN_NO_BIN="True"

DEPENDS = "cmake gtest python-argparse python-catkin-pkg-native python-empy-native python-nose"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/0.7.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1fef00c3336dfa23e2ec6d5f54741d95"
SRC_URI[sha256sum] = "2057edf73b042a304447c7433e97056f07a32e74a98a01b40ecd06064f1603b9"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-0.7.8-0"

SRC_URI += "\
    0001-CATKIN_WORKSPACES-Don-t-require-.catkin-file.patch \
    0001-Force-python-2.patch \
    0004-Try-to-work-around-Linux-limits.patch \
    0001-Duplicate-changes-for-newer-catkin-releases.patch \
    0001-use-python-provided-by-environment-instead-of-the-ge.patch \
    0001-python.cmake-look-for-python3-first.patch \
    0001-avoid-using-host-s-paths-when-cross-compiling.patch \
    0001-don-t-add-ld-library-path-to-the-cache.patch \
    0002-Add-quotes-to-generated-python-call.patch \
    0003-Run-bash-to-interpret.patch \
    0001-ignore-LD_LIBRARY_PATH-set-in-environment_cache.py.patch \
    0001-relocate-dependency-s-headers-to-current-sysroot.patch"
inherit catkin
